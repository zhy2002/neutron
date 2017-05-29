package zhy2002.examples.lodgement.bankc.di;

import dagger.Component;
import zhy2002.examples.lodgement.bankc.gen.di.BankCProfileModule;
import zhy2002.examples.lodgement.di.CommonModule;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.di.ProfileComponent;

import javax.inject.Singleton;

@Singleton
@Component(modules = {CommonModule.class, BankCProfileModule.class, CustomCbaProfileModule.class})
interface BankCProfileComponent extends ProfileComponent<ApplicationNodeContext> {
}