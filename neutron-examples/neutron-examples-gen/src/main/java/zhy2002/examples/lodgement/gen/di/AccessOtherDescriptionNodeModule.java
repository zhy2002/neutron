package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccessOtherDescriptionNodeModule {

    private final AccessOtherDescriptionNode owner;

    public AccessOtherDescriptionNodeModule(AccessOtherDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @AccessOtherDescriptionNodeScope @Owner AccessOtherDescriptionNode provideAccessOtherDescriptionNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

}