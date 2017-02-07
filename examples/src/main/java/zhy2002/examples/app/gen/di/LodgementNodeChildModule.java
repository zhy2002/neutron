package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.app.gen.*;

@Module(subcomponents = {
})
@LodgementNodeChildScope
public class LodgementNodeChildModule {


    @Provides
    @LodgementNodeChildScope
    @Named("appManagerNode")
    AppManagerNode provideAppManagerNode(
        LodgementNode parent,
        MembersInjector<AppManagerNode> injector
    ) {
        AppManagerNode node = new AppManagerNode(parent, "appManagerNode");

        injector.injectMembers(node);
        return node;
    }

}