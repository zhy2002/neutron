package zhy2002.mortgage.application.banka.di;

import dagger.Component;
import zhy2002.mortgage.application.banka.gen.di.BankAProfileModule;
import zhy2002.mortgage.application.di.CommonModule;
import zhy2002.mortgage.application.gen.ApplicationNodeContext;
import zhy2002.neutron.core.di.ProfileComponent;

import javax.inject.Singleton;

/**
 * Component interfaces are created manually.
 * This gives us a chance to add custom injection.
 */
@Singleton
@Component(modules = {CommonModule.class, BankAProfileModule.class, CustomBankAProfileModule.class})
interface BankAProfileComponent extends ProfileComponent<ApplicationNodeContext> {


}