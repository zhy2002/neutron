package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class StudentFlagNodeModule {

    private final StudentFlagNode owner;

    public StudentFlagNodeModule(StudentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @StudentFlagNodeScope @Owner StudentFlagNode provideStudentFlagNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}