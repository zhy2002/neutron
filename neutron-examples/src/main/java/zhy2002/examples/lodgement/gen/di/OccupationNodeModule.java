package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OccupationNodeModule {

    private final OccupationNode owner;

    public OccupationNodeModule(OccupationNode owner) {
        this.owner = owner;
    }

    @Provides @OccupationNodeScope @Owner OccupationNode provideOccupationNode() {
        return owner;
    }

    @Provides @OccupationNodeScope @Owner BaseOccupationNode<?> provideBaseOccupationNode() {
        return owner;
    }

    @Provides @OccupationNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OccupationNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OccupationNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}