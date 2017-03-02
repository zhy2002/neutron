package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.FirstNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstNameNode_MembersInjector implements MembersInjector<FirstNameNode> {
  private final Provider<FirstNameNodeComponent.Builder> builderProvider;

  public FirstNameNode_MembersInjector(Provider<FirstNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<FirstNameNode> create(
      Provider<FirstNameNodeComponent.Builder> builderProvider) {
    return new FirstNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(FirstNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      FirstNameNode instance, Provider<FirstNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
