package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class BusinessTypeNodeModule {

    private final BusinessTypeNode owner;

    public BusinessTypeNodeModule(BusinessTypeNode owner) {
        this.owner = owner;
    }

    @Provides @BusinessTypeNodeScope @Owner BusinessTypeNode provideBusinessTypeNode() {
        return owner;
    }

    @Provides @BusinessTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @BusinessTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BusinessTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BusinessTypeNodeScope SelfEmployedNode provideSelfEmployedNode() {
        return owner.getParent();
    }

}