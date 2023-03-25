package com.habuma.restfun;

import java.util.Arrays;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    Environment env = context.getEnvironment();
    System.out.println(env);
    String profiles[] = env.getActiveProfiles();
//    return env.containsProperty("magic");
    return Arrays.stream(profiles).anyMatch(p->p.equalsIgnoreCase("magic"));
  }
  
}
