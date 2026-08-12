import java.util.Optional;


/*
--> Methods in Optional <--
flatMap()
filter()
map()
orElseThrow()
orElseGet()
orElse()
ifPresent()
isPresent()
Optional.empty()
Optional.ofNullable()
Optional.of()
 */
public class _6_Optional {
    public static String getName(String name) {
        return name;
    }

    static void main(String[] args) {
        //traditional
        String name = getName("Azeem");
        if(name != null){
            System.out.println(name);
        }

        //BY Optional
        Optional<String> name0 = Optional.ofNullable(getName("Sahib"));
        name0.ifPresent(System.out::println);


    }
}
