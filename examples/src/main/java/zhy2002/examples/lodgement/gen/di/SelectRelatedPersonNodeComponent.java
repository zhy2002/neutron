package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SelectRelatedPersonNodeScope
@Subcomponent(modules = {SelectRelatedPersonNodeModule.class})
public interface SelectRelatedPersonNodeComponent {

    SelectRelatedPersonNodeRuleProvider getSelectRelatedPersonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectRelatedPersonNodeModule(SelectRelatedPersonNodeModule module);

        SelectRelatedPersonNodeComponent build();
    }
}
