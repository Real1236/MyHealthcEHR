import SearchbarComponent from "./SearchbarComponent";
import Switch from "./toggle"

const SearchBar = () => {

  return (
    <header className=" ">
      <div className="">
        <div className="flex justify-between items-center">
          <div className="flex items-center ">
            <Switch/>
            <div className=" mb-2 mr-8 pb-2 ml-6">
              <SearchbarComponent placeholder="Search anything..."/>
            </div>
          </div>
    </div>
    </div>
    </header>
  );
};

export default SearchBar;