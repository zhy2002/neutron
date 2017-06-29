package zhy2002.mortgage.application.bankb.di;

import dagger.Component;
import zhy2002.mortgage.application.bankb.gen.di.BankBProfileModule;
import zhy2002.mortgage.application.di.CommonModule;
import zhy2002.mortgage.application.gen.ApplicationNodeContext;
import zhy2002.neutron.di.ProfileComponent;

import javax.inject.Singleton;

/**
 * Component interfaces are created manually.
 * This gives us a chance to add custom injection.
 */
@Singleton
@Component(modules = {CommonModule.class, BankBProfileModule.class, CustomBankBProfileModule.class})
interface BankBProfileComponent extends ProfileComponent<ApplicationNodeContext> {


}