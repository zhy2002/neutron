package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherIncomePreviousYearNodeScope
@Subcomponent(modules = {OtherIncomePreviousYearNodeModule.class})
public interface OtherIncomePreviousYearNodeComponent {

    OtherIncomePreviousYearNodeRuleProvider getOtherIncomePreviousYearNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomePreviousYearNodeModule(OtherIncomePreviousYearNodeModule module);

        OtherIncomePreviousYearNodeComponent build();
    }
}
