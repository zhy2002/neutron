package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.StudentFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentFlagNode_MembersInjector implements MembersInjector<StudentFlagNode> {
  private final Provider<StudentFlagNodeComponent.Builder> builderProvider;

  public StudentFlagNode_MembersInjector(
      Provider<StudentFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<StudentFlagNode> create(
      Provider<StudentFlagNodeComponent.Builder> builderProvider) {
    return new StudentFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(StudentFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      StudentFlagNode instance, Provider<StudentFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
