package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


public interface AddressNodeComponent {


    AddressLineNode createAddressLineNode();
    SuburbNode createSuburbNode();
    PostcodeNode createPostcodeNode();
    CountryNode createCountryNode();

}
