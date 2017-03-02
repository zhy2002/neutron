package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SelectAccountHolderNodeScope
@Subcomponent(modules = {SelectAccountHolderNodeModule.class})
public interface SelectAccountHolderNodeComponent {

    SelectAccountHolderNodeRuleProvider getSelectAccountHolderNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectAccountHolderNodeModule(SelectAccountHolderNodeModule module);

        SelectAccountHolderNodeComponent build();
    }
}
