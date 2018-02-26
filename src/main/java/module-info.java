module my {
    requires java.base;
    requires java.xml.bind;
    opens my.jaxb to java.xml.bind;
}