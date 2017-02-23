package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonOtherIncomeDescriptionNodeModule {

    private final PersonOtherIncomeDescriptionNode owner;

    public PersonOtherIncomeDescriptionNodeModule(PersonOtherIncomeDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @PersonOtherIncomeDescriptionNodeScope @Owner PersonOtherIncomeDescriptionNode providePersonOtherIncomeDescriptionNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}