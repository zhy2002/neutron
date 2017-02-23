package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccessContactTypeNodeModule {

    private final AccessContactTypeNode owner;

    public AccessContactTypeNodeModule(AccessContactTypeNode owner) {
        this.owner = owner;
    }

    @Provides @AccessContactTypeNodeScope @Owner AccessContactTypeNode provideAccessContactTypeNode() {
        return owner;
    }

    @Provides @AccessContactTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessContactTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessContactTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}