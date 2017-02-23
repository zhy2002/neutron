package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherAssetDescriptionNodeScope
@Subcomponent(modules = {OtherAssetDescriptionNodeModule.class})
public interface OtherAssetDescriptionNodeComponent {

    OtherAssetDescriptionNodeRuleProvider getOtherAssetDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetDescriptionNodeModule(OtherAssetDescriptionNodeModule module);

        OtherAssetDescriptionNodeComponent build();
    }
}
