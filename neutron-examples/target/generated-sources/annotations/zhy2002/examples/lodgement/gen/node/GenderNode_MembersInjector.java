package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.GenderNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenderNode_MembersInjector implements MembersInjector<GenderNode> {
  private final Provider<GenderNodeComponent.Builder> builderProvider;

  public GenderNode_MembersInjector(Provider<GenderNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<GenderNode> create(
      Provider<GenderNodeComponent.Builder> builderProvider) {
    return new GenderNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(GenderNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      GenderNode instance, Provider<GenderNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
