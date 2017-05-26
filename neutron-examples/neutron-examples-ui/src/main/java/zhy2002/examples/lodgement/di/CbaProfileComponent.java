package zhy2002.examples.lodgement.di;

import dagger.Component;
import zhy2002.examples.lodgement.cba.gen.di.CbaProfileModule;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.di.ProfileComponent;

import javax.inject.Singleton;

@Singleton
@Component(modules = {CbaProfileModule.class, CustomNabProfileModule.class})
interface CbaProfileComponent extends ProfileComponent<ApplicationNodeContext> {
}
