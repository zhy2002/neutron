package zhy2002.neutron.di;

import zhy2002.neutron.UiNodeContext;

/**
 * Implemented by profile component class.
 */
public interface ProfileComponent<C extends UiNodeContext<?>> {

    C provideContext();

}
