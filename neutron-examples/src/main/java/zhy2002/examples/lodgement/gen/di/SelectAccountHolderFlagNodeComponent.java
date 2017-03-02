package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SelectAccountHolderFlagNodeScope
@Subcomponent(modules = {SelectAccountHolderFlagNodeModule.class})
public interface SelectAccountHolderFlagNodeComponent {

    SelectAccountHolderFlagNodeRuleProvider getSelectAccountHolderFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectAccountHolderFlagNodeModule(SelectAccountHolderFlagNodeModule module);

        SelectAccountHolderFlagNodeComponent build();
    }
}
