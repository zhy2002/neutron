package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PermanentResidentFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PermanentResidentFlagNode_MembersInjector
    implements MembersInjector<PermanentResidentFlagNode> {
  private final Provider<PermanentResidentFlagNodeComponent.Builder> builderProvider;

  public PermanentResidentFlagNode_MembersInjector(
      Provider<PermanentResidentFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PermanentResidentFlagNode> create(
      Provider<PermanentResidentFlagNodeComponent.Builder> builderProvider) {
    return new PermanentResidentFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PermanentResidentFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PermanentResidentFlagNode instance,
      Provider<PermanentResidentFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
