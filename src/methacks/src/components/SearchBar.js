import SearchbarComponent from "./SearchbarComponent";
import Switch from "./toggle"
import { BiSearchAlt } from "react-icons/bi"

const SearchBar = () => {

  return (
    <header>
      <div className="flex justify-between items-center ">
        <div className="flex items-center ">
          <Switch/>

          <div className="flex items-center ml-2">
            <SearchbarComponent placeholder="Search anything..." />
            <a href='/search'><button className="mx-2 font-xl text-black" type="submit">
              <BiSearchAlt className="text-3xl mt-10" />
            </button>
            </a>
          </div>
        </div>
      </div>
    </header>
  );
};

export default SearchBar;