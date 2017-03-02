package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EmployerNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerNameNode_MembersInjector implements MembersInjector<EmployerNameNode> {
  private final Provider<EmployerNameNodeComponent.Builder> builderProvider;

  public EmployerNameNode_MembersInjector(
      Provider<EmployerNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmployerNameNode> create(
      Provider<EmployerNameNodeComponent.Builder> builderProvider) {
    return new EmployerNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(EmployerNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmployerNameNode instance, Provider<EmployerNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
