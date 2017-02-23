package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MaritalStatusNodeModule {

    private final MaritalStatusNode owner;

    public MaritalStatusNodeModule(MaritalStatusNode owner) {
        this.owner = owner;
    }

    @Provides @MaritalStatusNodeScope @Owner MaritalStatusNode provideMaritalStatusNode() {
        return owner;
    }

    @Provides @MaritalStatusNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MaritalStatusNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MaritalStatusNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}