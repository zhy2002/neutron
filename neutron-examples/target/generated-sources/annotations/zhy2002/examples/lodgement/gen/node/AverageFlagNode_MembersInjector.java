package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AverageFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AverageFlagNode_MembersInjector implements MembersInjector<AverageFlagNode> {
  private final Provider<AverageFlagNodeComponent.Builder> builderProvider;

  public AverageFlagNode_MembersInjector(
      Provider<AverageFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AverageFlagNode> create(
      Provider<AverageFlagNodeComponent.Builder> builderProvider) {
    return new AverageFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AverageFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AverageFlagNode instance, Provider<AverageFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
