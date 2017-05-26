package zhy2002.examples.lodgement.di;

import dagger.Component;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.nab.gen.di.NabProfileModule;
import zhy2002.neutron.di.ProfileComponent;

import javax.inject.Singleton;

/**
 * Component interfaces are created manually.
 * This gives us a chance to add custom injection.
 */
@Singleton
@Component(modules = {NabProfileModule.class, CustomNabProfileModule.class})
interface NabProfileComponent extends ProfileComponent<ApplicationNodeContext> {
}
