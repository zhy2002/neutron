package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@BusinessTypeNodeScope
@Subcomponent(modules = {BusinessTypeNodeModule.class})
public interface BusinessTypeNodeComponent {

    BusinessTypeNodeRuleProvider getBusinessTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setBusinessTypeNodeModule(BusinessTypeNodeModule module);

        BusinessTypeNodeComponent build();
    }
}
