package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonOtherIncomePreviousYearNodeModule {

    private final PersonOtherIncomePreviousYearNode owner;

    public PersonOtherIncomePreviousYearNodeModule(PersonOtherIncomePreviousYearNode owner) {
        this.owner = owner;
    }

    @Provides @PersonOtherIncomePreviousYearNodeScope @Owner PersonOtherIncomePreviousYearNode providePersonOtherIncomePreviousYearNode() {
        return owner;
    }

    @Provides @PersonOtherIncomePreviousYearNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomePreviousYearNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomePreviousYearNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}