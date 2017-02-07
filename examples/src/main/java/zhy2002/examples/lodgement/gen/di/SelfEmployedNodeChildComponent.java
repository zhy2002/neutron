package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@SelfEmployedNodeChildScope
@Subcomponent(modules = {SelfEmployedNodeChildModule.class})
public interface SelfEmployedNodeChildComponent {

    BusinessTypeNode provideBusinessTypeNode(@Named("businessTypeNode") BusinessTypeNode impl);
    ProfitThisYearNode provideProfitThisYearNode(@Named("profitThisYearNode") ProfitThisYearNode impl);
    ProfitPreviousYearNode provideProfitPreviousYearNode(@Named("profitPreviousYearNode") ProfitPreviousYearNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setSelfEmployedNodeChildModule(SelfEmployedNodeChildModule module);

        SelfEmployedNodeChildComponent build();
    }
}
