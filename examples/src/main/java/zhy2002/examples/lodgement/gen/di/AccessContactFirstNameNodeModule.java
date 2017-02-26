package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccessContactFirstNameNodeModule {

    private final AccessContactFirstNameNode owner;

    public AccessContactFirstNameNodeModule(AccessContactFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @AccessContactFirstNameNodeScope @Owner AccessContactFirstNameNode provideAccessContactFirstNameNode() {
        return owner;
    }

    @Provides @AccessContactFirstNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessContactFirstNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessContactFirstNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}