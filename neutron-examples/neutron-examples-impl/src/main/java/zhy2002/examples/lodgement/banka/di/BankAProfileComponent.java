package zhy2002.examples.lodgement.banka.di;

import dagger.Component;
import zhy2002.examples.lodgement.banka.gen.di.BankAProfileModule;
import zhy2002.examples.lodgement.di.CommonModule;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.di.ProfileComponent;

import javax.inject.Singleton;

/**
 * Component interfaces are created manually.
 * This gives us a chance to add custom injection.
 */
@Singleton
@Component(modules = {CommonModule.class, BankAProfileModule.class, CustomBankAProfileModule.class})
interface BankAProfileComponent extends ProfileComponent<ApplicationNodeContext> {


}