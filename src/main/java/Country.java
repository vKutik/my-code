import java.util.Arrays;

/* in main


Country urkaine = new Country.Builder().setNameCountry("Ukraine").build();

*/

public class Country {
    private String nameCountry;
    private int popularyti;
    private String[] regions;

    public Country (Builder builder) {
        this.nameCountry = builder.nameCountry;
        this.popularyti = builder.popularyti;
        this.regions = builder.regions;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", popularyti=" + popularyti +
                '}';
    }

    public static class Builder {
        public Builder setNameCountry(String nameCountry) {
            this.nameCountry = nameCountry;
            return this;
        }

        public Builder setRegions(String[] regions) {
            this.regions = regions;
            return this;
        }

        public Builder setPopularyti(int popularyti) {
            this.popularyti = popularyti;
            return this;
        }

        private String nameCountry;
        private String[] regions;
        private int popularyti;

        public Country build() {
            if (this.popularyti <= 0) {
                throw new RuntimeException("Error popularyti is < 0");
            }
            return new Country(this);
        }
    }

}
