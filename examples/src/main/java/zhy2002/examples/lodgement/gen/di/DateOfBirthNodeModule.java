package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class DateOfBirthNodeModule {

    private final DateOfBirthNode owner;

    public DateOfBirthNodeModule(DateOfBirthNode owner) {
        this.owner = owner;
    }

    @Provides @DateOfBirthNodeScope @Owner DateOfBirthNode provideDateOfBirthNode() {
        return owner;
    }

    @Provides @DateOfBirthNodeScope @Owner DobNode<?> provideDobNode() {
        return owner;
    }

    @Provides @DateOfBirthNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @DateOfBirthNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @DateOfBirthNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}