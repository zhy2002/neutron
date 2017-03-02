package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.CountryCodeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryCodeNode_MembersInjector implements MembersInjector<CountryCodeNode> {
  private final Provider<CountryCodeNodeComponent.Builder> builderProvider;

  public CountryCodeNode_MembersInjector(
      Provider<CountryCodeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CountryCodeNode> create(
      Provider<CountryCodeNodeComponent.Builder> builderProvider) {
    return new CountryCodeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CountryCodeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CountryCodeNode instance, Provider<CountryCodeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
