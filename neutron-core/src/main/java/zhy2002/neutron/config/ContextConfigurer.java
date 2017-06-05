package zhy2002.neutron.config;

import zhy2002.neutron.UiNodeContext;

/**
 * Instance of this interface is used to dump relevant code gen
 * information to the context configuration.
 * @param <C> the concrete context type.
 */
public interface ContextConfigurer<C extends UiNodeContext<?>> extends Ordered {

    void configure(C context);
}
