package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SelectRelatedPersonFlagNodeScope
@Subcomponent(modules = {SelectRelatedPersonFlagNodeModule.class})
public interface SelectRelatedPersonFlagNodeComponent {

    SelectRelatedPersonFlagNodeRuleProvider getSelectRelatedPersonFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonFlagNodeModule(SelectRelatedPersonFlagNodeModule module);

        SelectRelatedPersonFlagNodeComponent build();
    }
}
