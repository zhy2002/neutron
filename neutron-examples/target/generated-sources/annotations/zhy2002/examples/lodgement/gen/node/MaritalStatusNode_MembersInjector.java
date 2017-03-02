package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MaritalStatusNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MaritalStatusNode_MembersInjector implements MembersInjector<MaritalStatusNode> {
  private final Provider<MaritalStatusNodeComponent.Builder> builderProvider;

  public MaritalStatusNode_MembersInjector(
      Provider<MaritalStatusNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MaritalStatusNode> create(
      Provider<MaritalStatusNodeComponent.Builder> builderProvider) {
    return new MaritalStatusNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MaritalStatusNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MaritalStatusNode instance, Provider<MaritalStatusNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
