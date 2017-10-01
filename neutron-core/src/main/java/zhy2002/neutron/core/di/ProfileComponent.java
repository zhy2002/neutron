package zhy2002.neutron.core.di;

import zhy2002.neutron.core.UiNodeContext;

/**
 * Implemented by profile component class.
 */
public interface ProfileComponent<C extends UiNodeContext<?>> {

    C provideContext();

}
