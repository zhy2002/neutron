package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@OtherAssetListNodeItemScope
@Subcomponent(modules = {OtherAssetListNodeItemModule.class})
public interface OtherAssetListNodeItemComponent {

    OtherAssetNode provideOtherAssetNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetListNodeItemModule(OtherAssetListNodeItemModule module);

        OtherAssetListNodeItemComponent build();
    }
}
