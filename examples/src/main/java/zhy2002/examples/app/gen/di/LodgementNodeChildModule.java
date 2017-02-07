package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.app.gen.*;

@Module(subcomponents = {
    AppManagerNodeChildComponent.class
})
@LodgementNodeChildScope
public class LodgementNodeChildModule {

    private final LodgementNode parent;

    public LodgementNodeChildModule(LodgementNode parent) {
        this.parent = parent;
    }


    @Provides
    @LodgementNodeChildScope
    @Named("appManagerNode")
    AppManagerNode provideAppManagerNode(
        MembersInjector<AppManagerNode> injector
    ) {
        AppManagerNode node = new AppManagerNode(parent, "appManagerNode");

        injector.injectMembers(node);
        return node;
    }

}