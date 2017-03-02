package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CountryNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryNode_MembersInjector implements MembersInjector<CountryNode> {
  private final Provider<CountryNodeComponent.Builder> builderProvider;

  public CountryNode_MembersInjector(Provider<CountryNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CountryNode> create(
      Provider<CountryNodeComponent.Builder> builderProvider) {
    return new CountryNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CountryNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CountryNode instance, Provider<CountryNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
