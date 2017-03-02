package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.AgeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AgeNode_MembersInjector implements MembersInjector<AgeNode> {
  private final Provider<AgeNodeComponent.Builder> builderProvider;

  public AgeNode_MembersInjector(Provider<AgeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AgeNode> create(
      Provider<AgeNodeComponent.Builder> builderProvider) {
    return new AgeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AgeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AgeNode instance, Provider<AgeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
