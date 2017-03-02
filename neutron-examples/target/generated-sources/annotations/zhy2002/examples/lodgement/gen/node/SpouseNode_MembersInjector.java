package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SpouseNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SpouseNode_MembersInjector implements MembersInjector<SpouseNode> {
  private final Provider<SpouseNodeComponent.Builder> builderProvider;

  public SpouseNode_MembersInjector(Provider<SpouseNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SpouseNode> create(
      Provider<SpouseNodeComponent.Builder> builderProvider) {
    return new SpouseNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SpouseNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SpouseNode instance, Provider<SpouseNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
