package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccessContactTitleNodeModule {

    private final AccessContactTitleNode owner;

    public AccessContactTitleNodeModule(AccessContactTitleNode owner) {
        this.owner = owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner AccessContactTitleNode provideAccessContactTitleNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

}