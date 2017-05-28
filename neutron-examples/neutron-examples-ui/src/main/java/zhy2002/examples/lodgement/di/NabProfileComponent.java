package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Component;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.di.LegalActionNodeScope;
import zhy2002.examples.lodgement.gen.node.LegalActionNodeRuleProvider;
import zhy2002.examples.lodgement.nab.gen.di.NabProfileModule;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.ProfileComponent;
import zhy2002.neutron.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.List;

/**
 * Component interfaces are created manually.
 * This gives us a chance to add custom injection.
 */
@Singleton
@Component(modules = {CommonModule.class, NabProfileModule.class, CustomNabProfileModule.class})
interface NabProfileComponent extends ProfileComponent<ApplicationNodeContext> {


}