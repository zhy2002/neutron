package zhy2002.neutron.core.config;

import zhy2002.neutron.core.UiNodeContext;

/**
 * Implemented by code gen.
 * @param <C> the concrete context type.
 */
public interface ContextConfigurer<C extends UiNodeContext<?>> extends Ordered {

    void configure(C context);
}
