package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MobileNumberNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MobileNumberNode_MembersInjector implements MembersInjector<MobileNumberNode> {
  private final Provider<MobileNumberNodeComponent.Builder> builderProvider;

  public MobileNumberNode_MembersInjector(
      Provider<MobileNumberNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MobileNumberNode> create(
      Provider<MobileNumberNodeComponent.Builder> builderProvider) {
    return new MobileNumberNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MobileNumberNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MobileNumberNode instance, Provider<MobileNumberNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
