package pl.pjatk.pawmec;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalOverride implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        // Return true if NOT "a" AND NOT "b"
        return context.getEnvironment().acceptsProfiles("prod");
    }
}