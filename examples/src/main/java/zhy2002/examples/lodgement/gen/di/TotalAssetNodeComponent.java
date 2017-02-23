package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TotalAssetNodeScope
@Subcomponent(modules = {TotalAssetNodeModule.class})
public interface TotalAssetNodeComponent {

    TotalAssetNodeRuleProvider getTotalAssetNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalAssetNodeModule(TotalAssetNodeModule module);

        TotalAssetNodeComponent build();
    }
}
